package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingARG_2000028Iterator thenon_self_governingARG_2000028Iterator = (non_self_governingARG_2000028Iterator)findAncestorWithClass(this, non_self_governingARG_2000028Iterator.class);
			pageContext.getOut().print(thenon_self_governingARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

