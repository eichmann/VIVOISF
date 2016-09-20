package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptERO_0000045Iterator theManuscript = (ManuscriptERO_0000045Iterator)findAncestorWithClass(this, ManuscriptERO_0000045Iterator.class);
			pageContext.getOut().print(theManuscript.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

