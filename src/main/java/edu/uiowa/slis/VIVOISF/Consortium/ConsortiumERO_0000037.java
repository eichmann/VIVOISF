package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumERO_0000037Iterator theConsortiumERO_0000037Iterator = (ConsortiumERO_0000037Iterator)findAncestorWithClass(this, ConsortiumERO_0000037Iterator.class);
			pageContext.getOut().print(theConsortiumERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

