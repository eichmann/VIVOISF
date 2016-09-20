package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteERO_0000037Iterator theInstituteERO_0000037Iterator = (InstituteERO_0000037Iterator)findAncestorWithClass(this, InstituteERO_0000037Iterator.class);
			pageContext.getOut().print(theInstituteERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

