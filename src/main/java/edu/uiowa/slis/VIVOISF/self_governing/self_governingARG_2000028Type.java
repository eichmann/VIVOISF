package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingARG_2000028Iterator theself_governingARG_2000028Iterator = (self_governingARG_2000028Iterator)findAncestorWithClass(this, self_governingARG_2000028Iterator.class);
			pageContext.getOut().print(theself_governingARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

