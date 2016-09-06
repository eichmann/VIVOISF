package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			geographical_region thegeographical_region = (geographical_region)findAncestorWithClass(this, geographical_region.class);
			if (!thegeographical_region.commitNeeded) {
				pageContext.getOut().print(thegeographical_region.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			geographical_region thegeographical_region = (geographical_region)findAncestorWithClass(this, geographical_region.class);
			return thegeographical_region.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing geographical_region for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			geographical_region thegeographical_region = (geographical_region)findAncestorWithClass(this, geographical_region.class);
			thegeographical_region.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for label tag ");
		}
	}
}

