package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptReproducesIterator theManuscriptReproducesIterator = (ManuscriptReproducesIterator)findAncestorWithClass(this, ManuscriptReproducesIterator.class);
			pageContext.getOut().print(theManuscriptReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

