package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumRO_0000056Iterator theConsortiumRO_0000056Iterator = (ConsortiumRO_0000056Iterator)findAncestorWithClass(this, ConsortiumRO_0000056Iterator.class);
			pageContext.getOut().print(theConsortiumRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

