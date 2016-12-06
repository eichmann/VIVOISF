package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingBFO_0000050Iterator thenon_self_governingBFO_0000050Iterator = (non_self_governingBFO_0000050Iterator)findAncestorWithClass(this, non_self_governingBFO_0000050Iterator.class);
			pageContext.getOut().print(thenon_self_governingBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

