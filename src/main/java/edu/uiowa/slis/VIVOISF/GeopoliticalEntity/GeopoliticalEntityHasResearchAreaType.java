package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHasResearchAreaIterator theGeopoliticalEntityHasResearchAreaIterator = (GeopoliticalEntityHasResearchAreaIterator)findAncestorWithClass(this, GeopoliticalEntityHasResearchAreaIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

