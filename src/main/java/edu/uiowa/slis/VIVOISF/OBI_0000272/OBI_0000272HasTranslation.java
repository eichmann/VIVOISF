package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272HasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272HasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272HasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272HasTranslationIterator theOBI_0000272HasTranslationIterator = (OBI_0000272HasTranslationIterator)findAncestorWithClass(this, OBI_0000272HasTranslationIterator.class);
			pageContext.getOut().print(theOBI_0000272HasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

