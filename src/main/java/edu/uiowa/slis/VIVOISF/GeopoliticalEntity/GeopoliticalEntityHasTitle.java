package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHasTitleIterator theGeopoliticalEntityHasTitleIterator = (GeopoliticalEntityHasTitleIterator)findAncestorWithClass(this, GeopoliticalEntityHasTitleIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

