package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameShortITIterator theGeopoliticalEntity = (GeopoliticalEntityNameShortITIterator)findAncestorWithClass(this, GeopoliticalEntityNameShortITIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

