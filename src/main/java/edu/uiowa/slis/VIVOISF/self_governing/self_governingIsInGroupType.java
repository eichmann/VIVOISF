package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingIsInGroupType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingIsInGroupType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingIsInGroupType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingIsInGroupIterator theself_governingIsInGroupIterator = (self_governingIsInGroupIterator)findAncestorWithClass(this, self_governingIsInGroupIterator.class);
			pageContext.getOut().print(theself_governingIsInGroupIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for isInGroup tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for isInGroup tag ");
		}
		return SKIP_BODY;
	}
}

