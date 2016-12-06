package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionARG_2000028Iterator thegeographical_regionARG_2000028Iterator = (geographical_regionARG_2000028Iterator)findAncestorWithClass(this, geographical_regionARG_2000028Iterator.class);
			pageContext.getOut().print(thegeographical_regionARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

