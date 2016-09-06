package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptReproducedInIterator theManuscriptReproducedInIterator = (ManuscriptReproducedInIterator)findAncestorWithClass(this, ManuscriptReproducedInIterator.class);
			pageContext.getOut().print(theManuscriptReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

