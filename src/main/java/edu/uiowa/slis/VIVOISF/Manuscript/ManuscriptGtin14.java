package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptGtin14Iterator theManuscript = (ManuscriptGtin14Iterator)findAncestorWithClass(this, ManuscriptGtin14Iterator.class);
			pageContext.getOut().print(theManuscript.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

