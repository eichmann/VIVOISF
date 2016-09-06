package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptRO_0000056Iterator theManuscriptRO_0000056Iterator = (ManuscriptRO_0000056Iterator)findAncestorWithClass(this, ManuscriptRO_0000056Iterator.class);
			pageContext.getOut().print(theManuscriptRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

