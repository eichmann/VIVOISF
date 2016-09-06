package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentHasTranslationIterator thePatentHasTranslationIterator = (PatentHasTranslationIterator)findAncestorWithClass(this, PatentHasTranslationIterator.class);
			pageContext.getOut().print(thePatentHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

