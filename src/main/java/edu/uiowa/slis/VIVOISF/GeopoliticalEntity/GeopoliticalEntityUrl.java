package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityUrlIterator theGeopoliticalEntity = (GeopoliticalEntityUrlIterator)findAncestorWithClass(this, GeopoliticalEntityUrlIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for url tag ");
		}
		return SKIP_BODY;
	}
}

