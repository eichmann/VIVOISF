package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingRO_0000056Iterator thenon_self_governingRO_0000056Iterator = (non_self_governingRO_0000056Iterator)findAncestorWithClass(this, non_self_governingRO_0000056Iterator.class);
			pageContext.getOut().print(thenon_self_governingRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

