package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumRO_0000053Iterator theConsortiumRO_0000053Iterator = (ConsortiumRO_0000053Iterator)findAncestorWithClass(this, ConsortiumRO_0000053Iterator.class);
			pageContext.getOut().print(theConsortiumRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

