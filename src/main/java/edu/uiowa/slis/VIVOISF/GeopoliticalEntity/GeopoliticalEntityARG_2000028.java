package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityARG_2000028Iterator theGeopoliticalEntityARG_2000028Iterator = (GeopoliticalEntityARG_2000028Iterator)findAncestorWithClass(this, GeopoliticalEntityARG_2000028Iterator.class);
			pageContext.getOut().print(theGeopoliticalEntityARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

