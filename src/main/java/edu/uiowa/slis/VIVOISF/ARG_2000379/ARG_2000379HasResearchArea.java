package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379HasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379HasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379HasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379HasResearchAreaIterator theARG_2000379HasResearchAreaIterator = (ARG_2000379HasResearchAreaIterator)findAncestorWithClass(this, ARG_2000379HasResearchAreaIterator.class);
			pageContext.getOut().print(theARG_2000379HasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

