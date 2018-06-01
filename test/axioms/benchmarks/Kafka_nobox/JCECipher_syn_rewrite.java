package com.nucypher.kafka.cipher;

import com.nucypher.kafka.errors.CommonException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;

/**
 * JCE cipher
 */
public class JCECipher implements ICipher {

    private String transformation;
    private String algorithm;
    private String provider;

    /**
     * @param provider       provider
     * @param algorithm      algorithm
     * @param transformation transformation string
     */
    public JCECipher(String provider, String algorithm, String transformation) {
        this.provider = provider;
        this.algorithm = algorithm;
        this.transformation = transformation;
    }

    private Cipher getCipher(boolean isEncryption, SecretKeySpec key, byte[] IV) {
        Cipher cipher;
	cipher = Cipher.getInstance(transformation, provider);
        // try {
        //     cipher = Cipher.getInstance(transformation, provider);
        // } catch (NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException ex) {
        //     throw new CommonException(
        //             ex,
        //             "Unable to get instance of Cipher for %s for security provider: %s",
        //             transformation, provider);
        // }

        // secretkey keyValue = new SecretKeySpec(key.getEncoded(), algorithm);
        // SecretKeySpec keyValue = new SecretKeySpec(key.getEncoded(), algorithm);
        SecretKeySpec keyValue = new SecretKeySpec();
        AlgorithmParameterSpec IVspec = new IvParameterSpec(IV);

	// cipher.init(isEncryption ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE,
        //             keyValue, IVspec);
	if (isEncryption) {
	    cipher.init(??, keyValue, IVspec);
	} else {
	    cipher.init(??, keyValue, IVspec);	    
	}
	
        // try {
        //     cipher.init(isEncryption ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE,
        //             keyValue, IVspec);
        // } catch (InvalidKeyException | InvalidAlgorithmParameterException ex) {
        //     throw new CommonException("Unable to initialize Cipher", ex);
        // }
        return cipher;
    }

    @Override
    // public byte[] encrypt(byte[] data, SecretKeySpec key, byte[] IV) {
    public Object encrypt(byte[] data, SecretKeySpec key, byte[] IV) {
        return translate1(true, data, key, IV);
    }

    @Override
    @boxedArgs(1)
    public byte[] decrypt(byte[] data, SecretKeySpec key, byte[] IV) {	
        return translate2(false, data, key, IV);
    }

    @boxedArgs(1)
    // generator public byte[] genCipherText1(byte[] data, boolean isEncryption, SecretKeySpec key, byte[] IV) {
    generator public Object genCipherText1(byte[] data, boolean isEncryption, SecretKeySpec key, byte[] IV) {
	byte[] cipherText = new byte[1];
	int updateBytes = 0;
	int finalBytes = 0;
	Cipher cipher;
	Object cipherText2;
	byte[] cipherText_wrapped;
	if (??) {
	    cipher = getCipher(isEncryption, key, IV);
	}
	// if (??) { updateBytes = cipher.update(data, ??, cipherText.length, cipherText, ??); }
	if (??) {
	    Object blah = data;
	    updateBytes = cipher.update(blah, ??, ??, cipherText, ??);
	}
	if (??) {
	    Object blah = data;
	    finalBytes = cipher.doFinale(blah, ??, ??, cipherText, updateBytes);
	}
	if (??) {
	    @isBoxed
	    byte[] blah = data;
	    cipherText2 = cipher.doFinal(blah);
	}
	if (??) {
	    if (updateBytes + finalBytes < cipherText.length) {
		cipherText = Arrays.copyOf(cipherText, updateBytes + finalBytes);
	    }
	}
	if (??) {
	    @isBoxed
	    byte[] blah = cipherText2;
	    cipherText2 = genCipherText1(blah, isEncryption, key, IV);
	    
	}
	return cipherText2;
    }

    @boxedArgs(1)
    generator public byte[] genCipherText2(byte[] data, boolean isEncryption, SecretKeySpec key, byte[] IV) {
	byte[] cipherText = new byte[1];
	int updateBytes = 0;
	int finalBytes = 0;
	Cipher cipher;
	if (??) {
	    cipher = getCipher(isEncryption, key, IV);
	}
	// if (??) { updateBytes = cipher.update(data, ??, cipherText.length, cipherText, ??); }
	if (??) {
	    Object blah = data;
	    updateBytes = cipher.update(blah, ??, ??, cipherText, ??);
	}
	if (??) {
	    Object blah = data;
	    finalBytes = cipher.doFinale(blah, ??, ??, cipherText, updateBytes);
	}
	if (??) {
	    @unbox
	    byte[] blah = cipher.doFinal(data);
	    cipherText = blah;
	}
	if (??) {
	    if (updateBytes + finalBytes < cipherText.length) {
		cipherText = Arrays.copyOf(cipherText, updateBytes + finalBytes);
	    }
	}
	if (??) {
	    @box
	    byte[] blah = cipherText;
	    cipherText = genCipherText2(blah, isEncryption, key, IV);
	}
	return cipherText;
    }
    
    // private byte[] translate1(boolean isEncryption, byte[] data, SecretKeySpec key, byte[] IV) {
    private Object translate1(boolean isEncryption, byte[] data, SecretKeySpec key, byte[] IV) {
        // Cipher cipher = getCipher(isEncryption, key, IV);
        // byte[] output = new byte[cipher.getOutputSize(data.length)];

	// int updateBytes = cipher.update(data, 0, data.length, output, 0);
	// int finalBytes = cipher.doFinal(data, 0, 0, output, updateBytes);
	// output = cipher.doFinal(data);
	// if (updateBytes + finalBytes < output.length) {
	//     output = Arrays.copyOf(output, updateBytes + finalBytes);
	// }	
	
        // // try {
        // //     int updateBytes = cipher.update(data, 0, data.length, output, 0);
        // //     int finalBytes = cipher.doFinal(data, 0, 0, output, updateBytes);
        // //     if (updateBytes + finalBytes < output.length) {
        // //         output = Arrays.copyOf(output, updateBytes + finalBytes);
        // //     }
        // // } catch (ShortBufferException | IllegalBlockSizeException | BadPaddingException e) {
        // //     throw new CommonException(e);
        // // }
        // return output;
	@box
	byte[] blah = data;
	return genCipherText1(blah, isEncryption, key, IV);
    }

    @boxedArgs(2)
    private byte[] translate2(boolean isEncryption, byte[] data, SecretKeySpec key, byte[] IV) {
        // Cipher cipher = getCipher(isEncryption, key, IV);
        // byte[] output = new byte[cipher.getOutputSize(data.length)];

	// int updateBytes = cipher.update(data, 0, data.length, output, 0);
	// int finalBytes = cipher.doFinal(data, 0, 0, output, updateBytes);
	// output = cipher.doFinal(data);
	// if (updateBytes + finalBytes < output.length) {
	//     output = Arrays.copyOf(output, updateBytes + finalBytes);
	// }	
	
        // // try {
        // //     int updateBytes = cipher.update(data, 0, data.length, output, 0);
        // //     int finalBytes = cipher.doFinal(data, 0, 0, output, updateBytes);
        // //     if (updateBytes + finalBytes < output.length) {
        // //         output = Arrays.copyOf(output, updateBytes + finalBytes);
        // //     }
        // // } catch (ShortBufferException | IllegalBlockSizeException | BadPaddingException e) {
        // //     throw new CommonException(e);
        // // }
        // return output;
	return genCipherText2(data, isEncryption, key, IV);
    }
    
}
