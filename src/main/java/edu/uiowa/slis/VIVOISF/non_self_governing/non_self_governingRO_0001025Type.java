package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingRO_0001025Iterator thenon_self_governingRO_0001025Iterator = (non_self_governingRO_0001025Iterator)findAncestorWithClass(this, non_self_governingRO_0001025Iterator.class);
			pageContext.getOut().print(thenon_self_governingRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}
