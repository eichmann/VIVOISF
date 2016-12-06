package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentHasResearchAreaIterator theContinentHasResearchAreaIterator = (ContinentHasResearchAreaIterator)findAncestorWithClass(this, ContinentHasResearchAreaIterator.class);
			pageContext.getOut().print(theContinentHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

