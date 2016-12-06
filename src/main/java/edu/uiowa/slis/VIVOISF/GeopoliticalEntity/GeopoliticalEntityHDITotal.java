package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHDITotalIterator theGeopoliticalEntity = (GeopoliticalEntityHDITotalIterator)findAncestorWithClass(this, GeopoliticalEntityHDITotalIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

