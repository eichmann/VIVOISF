package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameShortESIterator theGeopoliticalEntity = (GeopoliticalEntityNameShortESIterator)findAncestorWithClass(this, GeopoliticalEntityNameShortESIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

