package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumERO_0001520Iterator theConsortiumERO_0001520Iterator = (ConsortiumERO_0001520Iterator)findAncestorWithClass(this, ConsortiumERO_0001520Iterator.class);
			pageContext.getOut().print(theConsortiumERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

