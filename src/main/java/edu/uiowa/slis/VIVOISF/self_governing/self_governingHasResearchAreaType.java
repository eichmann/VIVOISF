package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingHasResearchAreaIterator theself_governingHasResearchAreaIterator = (self_governingHasResearchAreaIterator)findAncestorWithClass(this, self_governingHasResearchAreaIterator.class);
			pageContext.getOut().print(theself_governingHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

