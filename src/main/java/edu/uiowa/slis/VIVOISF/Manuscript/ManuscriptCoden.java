package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptCodenIterator theManuscript = (ManuscriptCodenIterator)findAncestorWithClass(this, ManuscriptCodenIterator.class);
			pageContext.getOut().print(theManuscript.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for coden tag ");
		}
		return SKIP_BODY;
	}
}

