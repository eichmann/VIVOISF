package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteERO_0001520Iterator theInstituteERO_0001520Iterator = (InstituteERO_0001520Iterator)findAncestorWithClass(this, InstituteERO_0001520Iterator.class);
			pageContext.getOut().print(theInstituteERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

