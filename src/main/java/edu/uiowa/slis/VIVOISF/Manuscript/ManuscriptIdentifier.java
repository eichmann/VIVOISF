package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptIdentifierIterator theManuscript = (ManuscriptIdentifierIterator)findAncestorWithClass(this, ManuscriptIdentifierIterator.class);
			pageContext.getOut().print(theManuscript.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for identifier tag ");
		}
		return SKIP_BODY;
	}
}

