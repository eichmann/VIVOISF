package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_region theGeographical_region = (Geographical_region)findAncestorWithClass(this, Geographical_region.class);
			if (!theGeographical_region.commitNeeded) {
				pageContext.getOut().print(theGeographical_region.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Geographical_region theGeographical_region = (Geographical_region)findAncestorWithClass(this, Geographical_region.class);
			return theGeographical_region.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Geographical_region for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Geographical_region theGeographical_region = (Geographical_region)findAncestorWithClass(this, Geographical_region.class);
			theGeographical_region.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for label tag ");
		}
	}
}

