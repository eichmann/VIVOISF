package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindHasResearchAreaIterator theKindHasResearchAreaIterator = (KindHasResearchAreaIterator)findAncestorWithClass(this, KindHasResearchAreaIterator.class);
			pageContext.getOut().print(theKindHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

