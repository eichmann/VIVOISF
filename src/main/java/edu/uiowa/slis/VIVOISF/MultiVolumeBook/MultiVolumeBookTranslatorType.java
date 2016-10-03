package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookTranslatorIterator theMultiVolumeBookTranslatorIterator = (MultiVolumeBookTranslatorIterator)findAncestorWithClass(this, MultiVolumeBookTranslatorIterator.class);
			pageContext.getOut().print(theMultiVolumeBookTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for translator tag ");
		}
		return SKIP_BODY;
	}
}

