package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptARG_0000001Iterator theManuscript = (ManuscriptARG_0000001Iterator)findAncestorWithClass(this, ManuscriptARG_0000001Iterator.class);
			pageContext.getOut().print(theManuscript.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

