package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptPmidIterator theManuscript = (ManuscriptPmidIterator)findAncestorWithClass(this, ManuscriptPmidIterator.class);
			pageContext.getOut().print(theManuscript.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for pmid tag ");
		}
		return SKIP_BODY;
	}
}

