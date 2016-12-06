package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentARG_2000028Iterator theContinentARG_2000028Iterator = (ContinentARG_2000028Iterator)findAncestorWithClass(this, ContinentARG_2000028Iterator.class);
			pageContext.getOut().print(theContinentARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

