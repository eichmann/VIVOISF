package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptHasTranslationIterator theManuscriptHasTranslationIterator = (ManuscriptHasTranslationIterator)findAncestorWithClass(this, ManuscriptHasTranslationIterator.class);
			pageContext.getOut().print(theManuscriptHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

