package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptAsinIterator theManuscript = (ManuscriptAsinIterator)findAncestorWithClass(this, ManuscriptAsinIterator.class);
			pageContext.getOut().print(theManuscript.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for asin tag ");
		}
		return SKIP_BODY;
	}
}

