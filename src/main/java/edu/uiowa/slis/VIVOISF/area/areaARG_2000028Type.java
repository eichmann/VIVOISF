package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(areaARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaARG_2000028Iterator theareaARG_2000028Iterator = (areaARG_2000028Iterator)findAncestorWithClass(this, areaARG_2000028Iterator.class);
			pageContext.getOut().print(theareaARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

