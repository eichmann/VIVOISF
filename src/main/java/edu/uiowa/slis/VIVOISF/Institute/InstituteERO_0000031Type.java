package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteERO_0000031Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteERO_0000031Type currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteERO_0000031Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteERO_0000031Iterator theInstituteERO_0000031Iterator = (InstituteERO_0000031Iterator)findAncestorWithClass(this, InstituteERO_0000031Iterator.class);
			pageContext.getOut().print(theInstituteERO_0000031Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

