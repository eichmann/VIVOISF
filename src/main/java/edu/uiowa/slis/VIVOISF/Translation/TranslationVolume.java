package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationVolumeIterator theTranslation = (TranslationVolumeIterator)findAncestorWithClass(this, TranslationVolumeIterator.class);
			pageContext.getOut().print(theTranslation.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for volume tag ");
		}
		return SKIP_BODY;
	}
}

