package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			License theLicense = (License)findAncestorWithClass(this, License.class);
			if (!theLicense.commitNeeded) {
				pageContext.getOut().print(theLicense.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing License for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			License theLicense = (License)findAncestorWithClass(this, License.class);
			return theLicense.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing License for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			License theLicense = (License)findAncestorWithClass(this, License.class);
			theLicense.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing License for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for label tag ");
		}
	}
}

