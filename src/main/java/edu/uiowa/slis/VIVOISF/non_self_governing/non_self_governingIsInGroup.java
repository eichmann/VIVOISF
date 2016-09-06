package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingIsInGroup extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingIsInGroup currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingIsInGroup.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingIsInGroupIterator thenon_self_governingIsInGroupIterator = (non_self_governingIsInGroupIterator)findAncestorWithClass(this, non_self_governingIsInGroupIterator.class);
			pageContext.getOut().print(thenon_self_governingIsInGroupIterator.getIsInGroup());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for isInGroup tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for isInGroup tag ");
		}
		return SKIP_BODY;
	}
}

