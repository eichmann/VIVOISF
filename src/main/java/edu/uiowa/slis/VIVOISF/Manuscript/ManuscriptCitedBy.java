package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptCitedByIterator theManuscriptCitedByIterator = (ManuscriptCitedByIterator)findAncestorWithClass(this, ManuscriptCitedByIterator.class);
			pageContext.getOut().print(theManuscriptCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

