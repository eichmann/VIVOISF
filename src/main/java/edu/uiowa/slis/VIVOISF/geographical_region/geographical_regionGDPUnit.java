package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionGDPUnitIterator thegeographical_region = (geographical_regionGDPUnitIterator)findAncestorWithClass(this, geographical_regionGDPUnitIterator.class);
			pageContext.getOut().print(thegeographical_region.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

