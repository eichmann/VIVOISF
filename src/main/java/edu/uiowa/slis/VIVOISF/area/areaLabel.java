package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(areaLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			if (!thearea.commitNeeded) {
				pageContext.getOut().print(thearea.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing area for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			return thearea.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing area for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			thearea.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing area for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for label tag ");
		}
	}
}

