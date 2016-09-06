package edu.uiowa.slis.VIVOISF.County;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CountyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			County theCounty = (County)findAncestorWithClass(this, County.class);
			if (!theCounty.commitNeeded) {
				pageContext.getOut().print(theCounty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing County for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing County for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			County theCounty = (County)findAncestorWithClass(this, County.class);
			return theCounty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing County for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing County for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			County theCounty = (County)findAncestorWithClass(this, County.class);
			theCounty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing County for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing County for label tag ");
		}
	}
}

