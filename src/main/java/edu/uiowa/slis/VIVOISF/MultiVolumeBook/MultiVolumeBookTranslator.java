package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookTranslatorIterator theMultiVolumeBookTranslatorIterator = (MultiVolumeBookTranslatorIterator)findAncestorWithClass(this, MultiVolumeBookTranslatorIterator.class);
			pageContext.getOut().print(theMultiVolumeBookTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for translator tag ");
		}
		return SKIP_BODY;
	}
}

