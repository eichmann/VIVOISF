package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptCitesIterator theManuscriptCitesIterator = (ManuscriptCitesIterator)findAncestorWithClass(this, ManuscriptCitesIterator.class);
			pageContext.getOut().print(theManuscriptCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for cites tag ");
		}
		return SKIP_BODY;
	}
}

