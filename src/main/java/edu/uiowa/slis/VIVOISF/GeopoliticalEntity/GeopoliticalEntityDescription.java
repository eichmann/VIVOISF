package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityDescriptionIterator theGeopoliticalEntity = (GeopoliticalEntityDescriptionIterator)findAncestorWithClass(this, GeopoliticalEntityDescriptionIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for description tag ");
		}
		return SKIP_BODY;
	}
}

