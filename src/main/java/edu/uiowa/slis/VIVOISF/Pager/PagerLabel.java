package edu.uiowa.slis.VIVOISF.Pager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PagerLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PagerLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PagerLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Pager thePager = (Pager)findAncestorWithClass(this, Pager.class);
			if (!thePager.commitNeeded) {
				pageContext.getOut().print(thePager.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Pager for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Pager for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Pager thePager = (Pager)findAncestorWithClass(this, Pager.class);
			return thePager.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Pager for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Pager for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Pager thePager = (Pager)findAncestorWithClass(this, Pager.class);
			thePager.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Pager for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Pager for label tag ");
		}
	}
}

